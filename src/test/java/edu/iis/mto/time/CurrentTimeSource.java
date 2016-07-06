package edu.iis.mto.time;

public class CurrentTimeSource implements TimeSource {

	@Override
	public long currentTimeMilis() {
		return System.currentTimeMillis();
	}

}
