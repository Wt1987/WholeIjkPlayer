package com.study.ijkvideoplayer.view;

import tv.danmaku.ijk.media.player.IMediaPlayer;

/**
 * author : taowang
 * date :2018/7/30
 * description:
 **/
public abstract class VideoPlayerListener implements IMediaPlayer.OnBufferingUpdateListener
        , IMediaPlayer.OnCompletionListener, IMediaPlayer.OnPreparedListener, IMediaPlayer.OnInfoListener
        , IMediaPlayer.OnVideoSizeChangedListener, IMediaPlayer.OnErrorListener
        , IMediaPlayer.OnSeekCompleteListener {


}


