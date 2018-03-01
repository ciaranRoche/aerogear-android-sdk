package org.aerogear.mobile.security.checks;

import android.app.admin.DevicePolicyManager;
import android.content.Context;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

import static org.robolectric.RuntimeEnvironment.systemContext;

@RunWith(RobolectricTestRunner.class)
public class EncryptionCheckTest {
    EncryptionCheck check;
    DevicePolicyManager policyManager;

    @Before
    public void setup(){
        check = new EncryptionCheck();
        policyManager = (DevicePolicyManager) systemContext.getSystemService(Context.DEVICE_POLICY_SERVICE);
    }

    @Test
    public void hasEncryptionEnabled(){
        policyManager.setStorageEncryption(RuntimeEnvironment.application,true);
    }

    @Test
    public void hasEncryptionDisabled(){

    }

    @Test (expected = IllegalArgumentException.class)
    public void nullContextTest() {
        check.test(null);
    }

}
