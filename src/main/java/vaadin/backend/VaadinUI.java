package vaadin.backend;


import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class VaadinUI extends VerticalLayout {



    public VaadinUI() {
        Button addButton = new Button("Add Wrestler", event -> {
            UI.getCurrent().navigate("add");
        });

        Button showListButton = new Button("Show all Wrestlers", event -> {
            UI.getCurrent().navigate("list");
        });


        Button buttonLogOut = new Button("", new Icon(VaadinIcon.OUT));
        buttonLogOut.addClickListener(buttonClickEvent -> {UI.getCurrent().navigate("login");});

        add(addButton, showListButton, buttonLogOut);


    }


}

