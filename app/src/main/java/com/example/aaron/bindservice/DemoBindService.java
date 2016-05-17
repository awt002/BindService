package com.example.aaron.bindservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class DemoBindService extends Service {

    private final IBinder iBinder = new LocalService();

    public DemoBindService()
    {

    }

    @Override
    public IBinder onBind(Intent intent)
    {
        return iBinder;
    }

    public String getFirstMessage()
    {
        return "This is the first message";
    }

    public String getSecondMessage()
    {
        return "This is the second message";
    }

    class LocalService extends Binder
    {
        public DemoBindService getService()
        {
            return DemoBindService.this;
        }
    }
}
