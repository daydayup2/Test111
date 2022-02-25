package Test4JDemo;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

/**
 * Test4JDemo1
 *
 * @author yuhl
 * @date 2022/1/25\
 *
 * 图像识别
 */

public class Test4jDemo1 {
    public static void main(String[] args)throws TesseractException {
        String path = "D:/test/";
        ITesseract instance = new Tesseract();
        //设置训练库的位置
        instance.setDatapath(path + "tessdata");

        //如果需要识别英文之外的语种，需要指定识别语种，并且需要将对应的语言包放进项目中
        // chi_sim ：简体中文， eng    根据需求选择语言库
        instance.setLanguage("eng");

        // 指定识别图片
        File img = new File(path + "imgs/33.jpg");
        long startTime = System.currentTimeMillis();
        String result = instance.doOCR(img);

        // 输出识别结果
        long endTime = System.currentTimeMillis();
        System.out.println("识别结果: \n" + result + "\n 耗时：" + (endTime - startTime) + "ms");
    }
}
