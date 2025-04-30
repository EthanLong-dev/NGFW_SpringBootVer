package win.NGFW.www.web.estore.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import win.NGFW.www.core.pojo.CartCore;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "cart_detail")
public class Cart extends CartCore {

    private static final long serialVersionUID = 4184641399155050546L;

    @Id
    @Column(name = "cart_detail_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cartDetailId;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "item_info_id")
    private Integer itemInfoId;
    @Column(name = "detail_itemcount")
    private Integer detailItemCount;
    @Column(name = "create_time", insertable = false)
    private Timestamp createTime;
}
