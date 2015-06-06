package hwpkg.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;

public class PageOne extends Composite{
	private VerticalPanel vPanel = new VerticalPanel();
	
	public PageOne() {
		initWidget(this.vPanel);
		
		Image img = new Image("images/1.jpg");
		vPanel.add(img);
		
	}
}
