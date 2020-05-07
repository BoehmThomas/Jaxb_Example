package controller;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean(name = "navigationController", eager = true)
@RequestScoped
public class NavigationController implements Serializable {

    @ManagedProperty(value = "#{param.pageId}")
    private String pageId;

    public String showPage() {
        switch (pageId) {
            case "0":
                return "index";
            case "1":
                return "addCustomer";
            case "2":
                return "index";
        }
        return "index";
    }
    public String getPageId() {
        return pageId;
    }
    public void setPageId(String pageId) {
        this.pageId = pageId;
    }
}