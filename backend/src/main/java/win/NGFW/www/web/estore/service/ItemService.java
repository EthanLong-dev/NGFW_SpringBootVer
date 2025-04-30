package win.NGFW.www.web.estore.service;

import win.NGFW.www.web.estore.entity.*;

import win.NGFW.www.web.estore.entity.ItemFromAdminEdit;
import win.NGFW.www.web.estore.entity.ItemInfo;
import win.NGFW.www.web.estore.entity.ItemModel;

import java.util.List;

public interface ItemService {

    Item pickById(Integer id);

    Integer pickPriceById(Integer id);

    List<Item> showAll();

    PageResponse<Item> showOnOnePage(Integer page, Integer pageSize);

    List<Item> searchItem(String keyword);

    List<Item> showRecommend(String itemType);

    List<Item> showAllWithModelName();

    ItemInfo addNewItem(ItemModel itemModel, Item item, ItemInfo itemInfo);

    List<ItemInfo> findItemInfosByItemId(Integer itemId);

    List<String> findColorsByItemId(Integer itemId);

    ItemInfo findItemInfoByIdForEdit(Integer itemInfoId);

    ItemInfo editItemInfo(ItemInfo itemInfo);

    Item findItemByIdForEdit(Integer itemId);

    Item editItemAndModel(ItemFromAdminEdit itemFromAdminEdit);

    ItemInfo updateListItemInfo(Integer itemStatus, Integer itemInfoId);

    Boolean checkItemExist(String itemName, String itemModel);
}
