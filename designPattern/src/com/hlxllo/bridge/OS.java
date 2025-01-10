package com.hlxllo.bridge;

/**
 * @author hlxllo
 * @description 抽象操作系统类
 * @date 2025/1/9
 */
public abstract class OS {

    protected VideoFile videoFile;

    public OS(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
