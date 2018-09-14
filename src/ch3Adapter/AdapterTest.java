package ch3Adapter;

interface RocketSim{
	double getMass();
}

class PhysicalRocket{
	public double getMass() {
		return 100;
	}
}

class MarsRocket extends PhysicalRocket implements RocketSim{
	
}

public class AdapterTest {
	public static void main(String[] args) {
		RocketSim rs = new MarsRocket();
		System.out.println(rs.getMass());
	}
}
