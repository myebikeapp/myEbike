package net.asovel.myebike.backendless.common;

import android.app.ProgressDialog;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.backendless.async.callback.BackendlessCallback;
import com.backendless.exceptions.BackendlessFault;

public class DefaultCallback<T> extends BackendlessCallback<T>
{
    public static final String TAG = DefaultCallback.class.getSimpleName();

    private Context context;
    private ProgressDialog progressDialog;

    public DefaultCallback(Context context)
    {
        this.context = context;
        progressDialog = ProgressDialog.show(context, "", "Loading...", true);
    }

    public DefaultCallback(Context context, String message)
    {
        this.context = context;
        progressDialog = ProgressDialog.show(context, "", message, true);
    }

    @Override
    public void handleResponse(T response)
    {
        progressDialog.cancel();
    }

    @Override
    public void handleFault(BackendlessFault fault)
    {
        progressDialog.cancel();
        Log.d(TAG, fault.getMessage());
        Toast.makeText(context, fault.getMessage(), Toast.LENGTH_LONG).show();
    }
}