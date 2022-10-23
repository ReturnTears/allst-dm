package com.allst.dm.compo;

/**
 * @author Hutu
 * @since 2022-10-23 下午 09:33
 */
public class Client {
    public static void main(String[] args) {
        Node driveD = new Folder("D:盘");

        Node doc = new Folder("文档");
        doc.addChild(new File("简历.doc"));
        doc.addChild(new File("项目介绍.ppt"));

        driveD.addChild(doc);

        Node music = new Folder("音乐");
        Node jay = new Folder("周杰伦");
        jay.addChild(new File("双截棍.mp3"));
        jay.addChild(new File("告白气球.mp3"));
        jay.addChild(new File("听妈妈的话.mp3"));

        Node jack = new Folder("张学友");
        jack.addChild(new File("吻别.mp3"));
        jack.addChild(new File("一千个伤心的理由.mp3"));

        music.addChild(jay);
        music.addChild(jack);

        driveD.addChild(music);

        driveD.tree();
    }
}
