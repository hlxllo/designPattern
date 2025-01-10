package com.hlxllo.bridge;

/**
 * @author hlxllo
 * @description avi 视频文件
 * @date 2025/1/9
 */
public class AviFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("avi 视频文件：" + fileName);
    }
}
