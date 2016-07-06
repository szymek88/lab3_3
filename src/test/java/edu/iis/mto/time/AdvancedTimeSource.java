package edu.iis.mto.time;

public class AdvancedTimeSource implements TimeSource {

	private static final long TWO_DAYS = 2*24*60*60*1000;

	@Override
	public long currentTimeMilis() {
		return System.currentTimeMillis() + TWO_DAYS;
	}

}
