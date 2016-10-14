package be.dbo.client;

import com.chap.links.client.Timeline;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.visualization.client.DataTable;
import com.google.gwt.visualization.client.VisualizationUtils;

/**
 * Created by diederikbosmans on 14/05/16.
 */
public class HelloEntryPoint implements EntryPoint{

    @Override
    public void onModuleLoad() {
        RootPanel.get().add(new Button("Hello"));

    }

}
