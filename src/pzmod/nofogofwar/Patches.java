package pzmod.nofogofwar;

import me.zed_0xff.zombie_buddy.Patch;
import zombie.iso.LightingJNI.JNILighting;

public final class Patches
{
    // We are allowed to access private members of JNILighting here because
    // of advice inlining, without any access transformation.
    @Patch(className = "zombie.iso.LightingJNI$JNILighting", methodName = "update")
    public static final class JNILightingPatch
    {
        @Patch.OnEnter
        public static void Enter(@Patch.This JNILighting _this) throws Exception
        {
            _this.vis |= JNILighting.VIS_SEEN;
        }
    }
}