package zombie.iso;

public class LightingJNI
{
    public static class JNILighting
    {
        // In the unlikely event that VIS_SEEN is ever changed we make the dummy field
        // not final in order to use the actual value from the real JNILighting class.
        public static byte VIS_SEEN = 1;
        public byte vis;
    }
}
