package com.hlxllo.bridge;

/**
 * @author hlxllo
 * @description Mac 操作系统
 * @date 2025/1/10
 */
public class Mac extends OS {

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        System.out.println("Mac 系统正在播放");
        videoFile.decode(fileName);
    }
}
