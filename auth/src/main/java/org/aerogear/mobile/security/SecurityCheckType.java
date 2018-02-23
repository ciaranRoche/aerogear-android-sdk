package org.aerogear.mobile.security;

import org.aerogear.mobile.security.checks.DeveloperModeCheck;
import org.aerogear.mobile.security.checks.DebuggerCheck;
import org.aerogear.mobile.security.checks.EmulatorCheck;
import org.aerogear.mobile.security.checks.RootedCheck;
import org.aerogear.mobile.security.checks.ScreenLockCheck;

/**
 * Checks that can be performed.
 */
public enum SecurityCheckType {
    /**
     *  Detect whether the device is rooted.
     *
     * @return <code>true</code> if the device is rooted.
     */
    IS_ROOTED(new RootedCheck()),
    /**
<<<<<<< HEAD
     * Detect if developer mode is enabled in the device.
     *
     * @return <code>true</code> if developer mode is enabled in the device.
     */
    IS_DEVELOPER_MODE(new DeveloperModeCheck()),
    /**
     * Detect if device is running in debug mode.
     *
     * @return <code>true</code> if debug mode is enabled in the device.
     */
    IS_DEBUGGER(new DebuggerCheck()),
    /**
     * Detect if device is an emulator
     *
     * @return <code>true</code> if device is an emulator.
     */
    IS_EMULATOR(new EmulatorCheck()),
    /**
     * Detect if device has a screen lock
     *
     * @return <code>true</code> if device has a screen lock enabled.
     */
    HAS_SCREEN_LOCK(new ScreenLockCheck());

    private SecurityCheck check;

    SecurityCheckType(SecurityCheck check) {
        this.check = check;
    }

    /**
     * Return the {@link SecurityCheck} implementation for this check.
     *
     * @return
     */
    public SecurityCheck getSecurityCheck() {
        return check;
    }

    /**
     * Returns the name of this security check.
     * The value is the same as {@link SecurityCheck#getName()}
     * @return
     */
    public String getName() {
        return getSecurityCheck().getName();
    }
}
