package win.NGFW.www.web.estore.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import win.NGFW.www.core.pojo.ItemCore;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "item_info")
public class ItemInfo extends ItemCore {

    private static final long serialVersionUID = 1430959596092393084L;

    @Id
    @Column(name = "item_info_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer itemInfoId;
    @Column(name = "item_id")
    private Integer itemId;
    @Column(name = "item_size")
    private String itemSize;
    @Column(name = "item_color")
    private String itemColor;
    @Column(name = "item_stock")
    private Integer itemStock;
    @Column(name = "item_status")
    private Integer itemStatus;
    @Column(name = "staff_id")
    private Integer staffId;
    @Column(name = "create_time", insertable = false)
    private Timestamp createTime;

    @Transient
    private String itemName;
    @Transient
    private Integer itemPriceInCart;
    @Transient
    private Integer itemCountsInCart;
    @Transient
    private String itemPhotoInCart;

}
