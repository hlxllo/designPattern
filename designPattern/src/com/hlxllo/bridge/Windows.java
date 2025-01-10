package com.hlxllo.bridge;

/**
 * @author hlxllo
 * @description windows 操作系统
 * @date 2025/1/10
 */
public class Windows extends OS {

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        System.out.println("windows 系统正在播放");
        videoFile.decode(fileName);
    }
}
