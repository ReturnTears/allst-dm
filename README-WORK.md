# WORK 常用设计模式

## EXCEL导入模式
```text
1、定义一个处理器抽象类，定义业务相关的属性、抽象方法、具体方法
    public abstract class IExcelImportHandle {
        public abstract void initOther();
    }
2、定义一个公共业务接口，包含处理器设置抽象方法、业务处理抽象方法
    public interface IExcelImportService {
        void setImportHandle(IExcelImportHandle var1);
        TFilePo importExcel(BasePo var1, String var2);
    }

3、实现业务类实现公共业务接口，实现业务类中处理初始化逻辑、业务处理逻辑等
    @Service
    @Scope("prototype")
    public class ExcelImportServiceImpl implements IExcelImportService {
        IExcelGenerateHandle generateHandle;
        @Autowired
        @IBaseDao iBaseDao;
        @Autowired
        IFileService fileService;
        
    }
4、定义处理器实现类，继承处理器抽象类，实现类中完成相应的业务逻辑

5、使用时，引入公共业务接口，new一个i定义的抽象接类实现类，调用公共接口中业务抽象方法，获取返回值

```

## EXCEL导出模式
```text
1、定义一个构建Excel模板的接口
    public interface IGenerateExcelService {
        void setGenerateHandle(IExcelGenerateHandle var1);
        ByteArrayOutputStream generateExcel(BasePo var1);
    }
2、实现1中的接口，完成生成Excel模板的逻辑
    @Service
    @Scope("prototype")
    public class GenerateExcelServiceImpl implements IGenerateExcelService {
        IExcelGenerateHandle generateHandle;
        @Autowired
        @IBaseDao iBaseDao;
        
        public GenerateExcelServiceImpl() {}
        
        @Override
        public void setGenerateHandle(IExcelGenerateHandle generateHandle) {
            this.generateHandle = generateHandle;
        }
        
        @Override
        public ByteArrayOutputStream generateExcel(BasePo var1) {
            if (this.generateHandle == null) {
                System.out.println("没有对应的Excel处理器.....")
            }
            ByteArrayOutputStream outData = new ByteArrayOutputStream();
            ExcelWriter writer = new ExcelWriter(outData, ExcelTypeEnum.XLS);
            // 处理后续的逻辑
            return outData;
        }
    }
3、定义一个处理器接口,定义一些辅助处理Excel模板的方法
    public interface IExcelGenerateHandle {
        String getSheetName(int val1, List<BasePo> var2);
        String getSheetQueryId(int val1, List<BasePo> var2);
        void handleQueryPo(BasePo var1, int var2, List<BasePo> var3, BasePo var4);
        ExcelTitleBean getExcelTitles(int val1)
    }
4、实现处理器接口
   public UserExportHandle implments IExcelGenerateHandle {
    // 实现接口对应方法， 完成相应逻辑
   }
5、控制层使用
    @Autowired
    private IGenerateExcelService excelService;
    public void export(HttpServletResponse response) {
        IExcelGenerateHandle handle = new UserExportHandle();
        excelService.setGenerateHandle(handle);
        
        ByteArrayOutputStream byteData = excelService.generateExcel(null);
        
        // 使用对应的二进制流导出文件
    }



```