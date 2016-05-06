/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.cts.net.hostside.app2;

import static com.android.cts.net.hostside.app2.Common.TAG;
import android.app.Activity;
import android.util.Log;

/**
 * Activity used to bring process to foreground.
 */
public class MyActivity extends Activity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "MyActivity.onStart()");
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "MyActivity.onDestroy()");
        super.onDestroy();
    }
}
