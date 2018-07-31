package com.study.ijkvideoplayer.util;

import com.study.ijkvideoplayer.view.VideoPlayerListener;

import tv.danmaku.ijk.media.player.IMediaPlayer;

/**
 * author : taowang
 * date :2018/7/30
 * description:
 **/
public class DefaultVideoPlayerListener extends VideoPlayerListener {
    @Override
    public void onPrepared(IMediaPlayer mp) {
        mp.start();
    }

    @Override
    public void onCompletion(IMediaPlayer mp) {
        mp.seekTo(0);
        mp.start();
    }

    @Override
    public void onBufferingUpdate(IMediaPlayer mp, int percent) {

    }

    @Override
    public void onSeekComplete(IMediaPlayer mp) {

    }

    @Override
    public void onVideoSizeChanged(IMediaPlayer mp, int width, int height, int sar_num, int sar_den) {

    }

    @Override
    public boolean onError(IMediaPlayer mp, int what, int extra) {
        return false;
    }

    @Override
    public boolean onInfo(IMediaPlayer mp, int what, int extra) {
        return false;
    }
}
