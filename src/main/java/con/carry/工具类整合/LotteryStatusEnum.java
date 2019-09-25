package con.carry.工具类整合;

/**
 * wuwenshuai
 */
public enum LotteryStatusEnum {

    DRAFT(0, "草稿"),
    WAIT_START(1, "等待开始"),
    JOINING(2, "报名中"),
    WAIT_OPEN_LOTTERY(3, "报名截止，等待开奖"),
    OPENED_LOTTERY(4, "已开奖");

    private int type;
    private String desc;

    LotteryStatusEnum(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public static LotteryStatusEnum getByType(int type) {
        for (LotteryStatusEnum lotteryStatusEnum : values()) {
            if (type == lotteryStatusEnum.type) {
                return lotteryStatusEnum;
            }
        }
        return null;
    }

    public int getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }
}
