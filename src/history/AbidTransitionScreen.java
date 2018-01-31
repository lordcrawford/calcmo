package history;

import java.util.List;

import guiTeacher.components.Graphic;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;
import main.CalcMoMain;

public class AbidTransitionScreen extends AbidCalculatorScreen implements Runnable{
	
	public AbidCalculatorScreen s;

	public AbidTransitionScreen(int width, int height) {
		super(width, height);
	}

	public void initAllObjects(List<Visible> viewObjects) {
		viewObjects.add(new Graphic(0, 0, getWidth(),getHeight(),"resources/beemo-transitionScreen.png"));
		
	}
	
	public void run() {
		CalcMoMain.main.setScreen(new AbidTransitionScreen(getWidth(),getHeight()));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CalcMoMain.main.setScreen(s);
	}

}
