package vaadin.backend;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import vaadin.model.Wrestler;

import java.util.List;

@Route("list")
public class WrestlerDeckGui extends VerticalLayout {

    WrestlerManager manager;
    List<Wrestler> wrestlers;

    @Autowired
    public WrestlerDeckGui(WrestlerManager manager) {
        this.manager = manager;
        wrestlers = manager.getAll();
        Button returnButton = new Button("Menu", event -> {
            UI.getCurrent().navigate("");
        });

        add(returnButton);

        Grid<Wrestler> grid = new Grid<>(Wrestler.class);
        grid.setItems(wrestlers);


        grid.removeColumnByKey("image");
        grid.removeColumnByKey("id");

        grid.addColumn(new ComponentRenderer<>(wrestler -> {
            Image image = new Image(wrestler.getImage(), wrestler.getName());
            image.setMaxWidth("200px");
            image.setMaxHeight("200px");
            return image;
        })).setHeader("Image");

        add(grid);
    }
}

