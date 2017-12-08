package org.usfirst.frc.team6329.robot;

public class Constants {

    public static boolean isrobot = true;

    public static double pickConstant(double IntroValue, double BotValue) {
        return isrobot ? IntroValue : BotValue;
    }

    public static int pickConstant(int IntroValue, int BotValue) {
        return isrobot ? IntroValue : BotValue;
    }

    public static boolean pickConstant(boolean IntroValue, boolean BotValue) {
        return isrobot ? IntroValue : BotValue;
    }

    public static long pickConstant(long IntroValue, long BotValue) {
        return isrobot? IntroValue : BotValue;
    }

   /* public class OI {
    	public static final long RUMBLE_MILLIS = 250;
        public static final double RUMBLE_INTENSITY = 1.0;
    }  */

   /* public class GearSystem {
        public static final double LOWER_SPEED = 0.2;
        public static final double RAISE_SPEED = -0.2;
        public static final double HOLD_DOWN_SPEED = 0.1;
        public static final double HOLD_UP_SPEED = -0.1;

        public static final long RAISE_TIME = 1000;
        public static final long LOWER_TIME = 500;
        public static final double HARDSTOP_AMPS = 7.0;
        public static final long OVERRIDE_TIME = 200;

        }*/
    }

