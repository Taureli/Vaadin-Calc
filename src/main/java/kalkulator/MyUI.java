package kalkulator;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Theme("mytheme")
//@Widgetset("kalkulator.MyAppWidgetset")
public class MyUI extends UI {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String currentValue;
	String previousValue;
	
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        setContent(layout);
        
        //TextField with my "screen"
        final TextField myDisplay = new TextField("Wynik");
        myDisplay.setValue("");
        layout.addComponent(myDisplay);
        
        //------Button rows-----------
        HorizontalLayout firstLine = new HorizontalLayout();
        HorizontalLayout secondLine = new HorizontalLayout();
        HorizontalLayout thirdLine = new HorizontalLayout();
        layout.addComponent(firstLine);
        layout.addComponent(secondLine);
        layout.addComponent(thirdLine);
        //-----------------------------
        
        //------All the buttons--------
        Button button7 = new Button("7");
        button7.addClickListener(new Button.ClickListener() {
			private static final long serialVersionUID = 1L;

			@Override
            public void buttonClick(ClickEvent event) {
                currentValue = (String) myDisplay.getValue();
                currentValue += "7";
                myDisplay.setValue(currentValue);
            }
        });
        firstLine.addComponent(button7);
        
        Button button8 = new Button("8");
        button8.addClickListener(new Button.ClickListener() {
			private static final long serialVersionUID = 1L;

			@Override
            public void buttonClick(ClickEvent event) {
                currentValue = (String) myDisplay.getValue();
                currentValue += "8";
                myDisplay.setValue(currentValue);
            }
        });
        firstLine.addComponent(button8);
        
        Button button9 = new Button("9");
        button9.addClickListener(new Button.ClickListener() {
			private static final long serialVersionUID = 1L;

			@Override
            public void buttonClick(ClickEvent event) {
                currentValue = (String) myDisplay.getValue();
                currentValue += "9";
                myDisplay.setValue(currentValue);
            }
        });
        firstLine.addComponent(button9);
        
        Button buttonMinus = new Button(" - ");
        buttonMinus.addClickListener(new Button.ClickListener() {
        	private static final long serialVersionUID = 1L;
        	
			@Override
			public void buttonClick(ClickEvent event) {
				previousValue = currentValue;
				currentValue = "";
				myDisplay.setValue(currentValue);
				
			}
		});
        firstLine.addComponent(buttonMinus);
        
        Button button4 = new Button("4");
        button4.addClickListener(new Button.ClickListener() {
			private static final long serialVersionUID = 1L;

			@Override
            public void buttonClick(ClickEvent event) {
                currentValue = (String) myDisplay.getValue();
                currentValue += "4";
                myDisplay.setValue(currentValue);
            }
        });
        secondLine.addComponent(button4);
        
        Button button5 = new Button("5");
        button5.addClickListener(new Button.ClickListener() {
			private static final long serialVersionUID = 1L;

			@Override
            public void buttonClick(ClickEvent event) {
                currentValue = (String) myDisplay.getValue();
                currentValue += "5";
                myDisplay.setValue(currentValue);
            }
        });
        secondLine.addComponent(button5);
        
        Button button6 = new Button("6");
        button6.addClickListener(new Button.ClickListener() {
			private static final long serialVersionUID = 1L;

			@Override
            public void buttonClick(ClickEvent event) {
                currentValue = (String) myDisplay.getValue();
                currentValue += "6";
                myDisplay.setValue(currentValue);
            }
        });
        secondLine.addComponent(button6);
        
        Button buttonPlus = new Button("+");
        buttonPlus.addClickListener(new Button.ClickListener() {
        	private static final long serialVersionUID = 1L;
        	
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
			}
		});
        secondLine.addComponent(buttonPlus);
        
        Button button1 = new Button("1");
        button1.addClickListener(new Button.ClickListener() {
			private static final long serialVersionUID = 1L;

			@Override
            public void buttonClick(ClickEvent event) {
                currentValue = (String) myDisplay.getValue();
                currentValue += "1";
                myDisplay.setValue(currentValue);
            }
        });
        thirdLine.addComponent(button1);
        
        Button button2 = new Button("2");
        button2.addClickListener(new Button.ClickListener() {
			private static final long serialVersionUID = 1L;

			@Override
            public void buttonClick(ClickEvent event) {
                currentValue = (String) myDisplay.getValue();
                currentValue += "2";
                myDisplay.setValue(currentValue);
            }
        });
        thirdLine.addComponent(button2);
        
        Button button3 = new Button("3");
        button3.addClickListener(new Button.ClickListener() {
			private static final long serialVersionUID = 1L;

			@Override
            public void buttonClick(ClickEvent event) {
                currentValue = (String) myDisplay.getValue();
                currentValue += "3";
                myDisplay.setValue(currentValue);
            }
        });
        thirdLine.addComponent(button3);
        
        Button buttoneEuals = new Button("=");
        buttoneEuals.addClickListener(new Button.ClickListener() {
        	private static final long serialVersionUID = 1L;
        	
			@Override
			public void buttonClick(ClickEvent event) {
				int temp = Integer.parseInt(previousValue) - Integer.parseInt(currentValue);
				currentValue = Integer.toString(temp);
				myDisplay.setValue(currentValue);
				
			}
		});
        thirdLine.addComponent(buttoneEuals);
        //-----------------------------
                
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(widgetset="kalkulator.MyAppWidgetset", ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
		private static final long serialVersionUID = 1L;
    }
}
