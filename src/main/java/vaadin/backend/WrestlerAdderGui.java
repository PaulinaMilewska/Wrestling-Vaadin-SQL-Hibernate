package vaadin.backend;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import vaadin.model.Wrestler;
import vaadin.model.WrestlingOrganisationType;

@Route("add")
public class WrestlerAdderGui extends VerticalLayout {

    @Autowired
    public WrestlerAdderGui(WrestlerDeck wrestlerDeck) {

        Button returnButton = new Button("Menu", event -> {
            UI.getCurrent().navigate("");
        });

        add(returnButton);
        setAlignItems(Alignment.CENTER);
//        setComponentAlignment(returnButton, Alignment.TOP_CENTER);

        TextField textFieldName = new TextField("name");
        TextField textFieldImage = new TextField("image");
        ComboBox<WrestlingOrganisationType> wrestlerTypeComboBox = new ComboBox<>("Wrestling organisation: ", WrestlingOrganisationType.values());
        Button buttonAdd = new Button("Add Wrestler");


        buttonAdd.addClickListener(buttonClickEvent -> {
            Wrestler wrestler = new Wrestler();
            wrestler.setName(textFieldName.getValue());
            wrestler.setImage(textFieldImage.getValue());
            textFieldImage.setMaxHeight("200px");
            textFieldImage.setMaxWidth("200px");
            wrestler.setWrestlingOrganisationType(wrestlerTypeComboBox.getValue());
            wrestlerDeck.getWrestlerList().add(wrestler);
            Notification notification = new Notification(
                    "Wrestler is added", 3000);
            notification.open();
        });

        add(textFieldName, textFieldImage, wrestlerTypeComboBox, buttonAdd);
    }
}

