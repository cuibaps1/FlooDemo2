package com.quidproquo.floodemo2.ui.fragments;

import android.os.Environment;

public class FilePaths {

    public String ROOT_DIR = Environment.getExternalStorageDirectory().getPath();

    public String AUDIOS = ROOT_DIR + "/Audio";

    public String FIREBASE_AUDIO_STORAGE = "photo/users";

}
