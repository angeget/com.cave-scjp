package com.philiphagenbruch.comcave.scjp.p20170724;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {

    public class LotteryTicket {

        private final List<Integer> tip = new ArrayList<Integer>();

        private LotteryTicket() {};

        public void tip() {
            if (tip.isEmpty()) {
                for (int i = 0; i < draws; i++) {
                    tip.add(rand.nextInt(numBalls + 1));
                }
            }
        }

    }

    private final int draws;

    private final int numBalls;
    private final List<Integer> balls = new ArrayList<Integer>();

    private final List<Integer> drawn = new ArrayList<Integer>();

    private final Random rand = new Random();

    public Lottery(final int draws, final int numBalls) {
        this.draws = draws;
        this.numBalls = numBalls;

        for (int i = 1; i <= numBalls; i++) {
            this.balls.add(i);
        }
    }

    public void draw() {
        if (drawn.isEmpty()) {
            for (int i = 0; i < draws; i++) {
                final Integer b = balls.get(rand.nextInt(balls.size()));
                drawn.add(b);
                balls.remove(b);
                Collections.sort(drawn);
            }
        }
    }

    public LotteryTicket getTicket() {
        return new LotteryTicket();
    }

    public int redeem(final LotteryTicket ticket) {
        int hits = 0;
        for (int i = 0; i < draws; i++) {
            if (drawn.contains(ticket.tip.get(i))) {
                hits++;
            }
        }
        return hits > 0 ? (int) Math.pow(10, hits) : 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Lottery ")
                .append(draws).append(" out of ").append(numBalls);

        if (!drawn.isEmpty()) {
            sb.append(" [");
            for (int i = 0; i < drawn.size(); i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(drawn.get(i));
            }
            sb.append("]");
        }
        return sb.toString();
    }

}
