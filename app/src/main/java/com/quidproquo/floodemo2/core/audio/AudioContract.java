package com.quidproquo.floodemo2.core.audio;

import android.content.Context;

import com.quidproquo.floodemo2.models.Audio;

public interface AudioContract {

    interface View {
        void onSendAudioSuccess();

        void onSendAudioFailure(String message);

        void onGetAudioSuccess(Audio audio);

        void onGetAudioFailure(String message);
    }

    interface Presenter {
        void sendMessage(Context context, Audio chat, String receiverFirebaseToken);

        void getMessage(String senderUid, String receiverUid);
    }

    interface Interactor {
        void sendMessageToFirebaseUser(Context context, Audio chat, String receiverFirebaseToken);

        void getMessageFromFirebaseUser(String senderUid, String receiverUid);
    }

    interface OnSendMessageListener {
        void onSendMessageSuccess();

        void onSendMessageFailure(String message);
    }

    interface OnGetMessagesListener {
        void onGetMessagesSuccess(Audio audio);

        void onGetMessagesFailure(String message);
    }
}
