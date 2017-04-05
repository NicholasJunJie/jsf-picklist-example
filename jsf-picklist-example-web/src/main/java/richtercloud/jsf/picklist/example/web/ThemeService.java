/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package richtercloud.jsf.picklist.example.web;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import richtercloud.jsf.picklist.example.jar.Theme;

/**
 *
 * @author richter
 */
@ManagedBean
public class ThemeService {

    public List<Theme> getThemes() {
        return new LinkedList<>(Arrays.asList(new Theme("theme1"),
                new Theme("theme2"),
                new Theme("theme3"),
                new Theme("theme4"),
                new Theme("theme5")));
    }
}
