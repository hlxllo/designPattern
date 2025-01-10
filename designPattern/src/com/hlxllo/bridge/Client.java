package com.hlxllo.bridge;

/**
 * @author hlxllo
 * @description
 * @date 2025/1/10
 */
public class Client {
    public static void main(String[] args) {
        VideoFile videoFile = new Mp4File();
        OS os = new Windows(videoFile);
        os.play("XXX");
    }
}
