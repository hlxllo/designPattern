package com.hlxllo.bridge;

/**
 * @author hlxllo
 * @description mp4 视频文件
 * @date 2025/1/9
 */
public class Mp4File implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("mp4 视频文件" + fileName);
    }
}
