package win.NGFW.www.web.estore.entity;

import lombok.Getter;
import lombok.Setter;
import win.NGFW.www.core.pojo.ItemCore;

@Getter
@Setter
public class ItemFromAdminEdit extends ItemCore {

    private static final long serialVersionUID = -4808571005449877546L;

    private ItemModel itemModel;
    private Item item;

}
