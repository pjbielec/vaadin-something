package vaadinsomething;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class View extends VerticalLayout {

    public View() {
        add(new Button("Hello there",
                e -> Notification.show("General Kenobi")));
    }

}
