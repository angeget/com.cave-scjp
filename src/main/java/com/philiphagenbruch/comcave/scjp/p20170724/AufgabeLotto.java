package com.philiphagenbruch.comcave.scjp.p20170724;

import com.philiphagenbruch.comcave.scjp.p20170724.Lottery.LotteryTicket;

public class AufgabeLotto {

    public static void main(final String[] args) {
        final Lottery l = new Lottery(7, 49);
        l.draw();

        final int plays = 100000;
        int win = 0;
        for (int i = 0; i < plays; i++) {
            final LotteryTicket t = l.getTicket();
            t.tip();
            win += l.redeem(t);
        }

        System.out.println(win - plays);

    }

}
