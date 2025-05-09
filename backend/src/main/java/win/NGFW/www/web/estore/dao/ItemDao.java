package win.NGFW.www.web.estore.dao;

import win.NGFW.www.web.estore.entity.Item;
import win.NGFW.www.web.estore.entity.ItemInfo;
import win.NGFW.www.web.estore.entity.ItemModel;

import java.util.List;

public interface ItemDao {

    Item selectItemById(Integer id);

    Integer selectItemPriceById(Integer id);

    ItemModel selectItemModelByModelName(String modelName);

    List<ItemModel> selectAllItemModel();

    Item selectItemByItemName(String itemName);

    ItemInfo selectItemInfoByItemInfoIdAndSizeAndColor(ItemInfo itemInfo);

    List<Item> selectAll();

    List<Item> selectForOnePage(Integer page, Integer pageSize);

    Long countItems();

    List<Item> selectByKeyword(String keyword);

    List<Item> selectRecommendByType(String itemType);

    Integer addItemModel(ItemModel itemModel);

    Integer addItem(Item item);

    Integer addItemInfo(ItemInfo itemInfo);

    List<ItemInfo> selectItemInfosByItemId(Integer itemId);

    List<String> selectItemColorsByItemId(Integer itemId);

    ItemInfo selectItemInfoByItemInfoId(Integer itemInfoId);

    ItemModel selectItemModelById(Integer itemModelId);

    ItemInfo editItemInfo(ItemInfo itemInfo);

    Item editItem(Item item);

    ItemModel editItemModel(ItemModel itemModel);

    List<Object[]> selectItemAndModelByIdForEdit(Integer itemId);

    Integer updateListItemInfo(Integer itemStatus, Integer itemInfoId);

    Integer selectItemCountByItemInfoId(Integer itemInfoId);

    Integer editItemCountByItemInfoId(Integer itemTotalCount, Integer itemInfoId);

    Integer editItemStockBackByItemInfoId(Integer itemCountInReceipt, Integer itemInfoId);
}
