package com.ZDYX.cinema;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ShouPiaoChuTest {
    @Test
    public void should_return_30_for_single_ticket() {
        Double result = 30D;
        Double expected = new ShouPiaoChu().getPriceFor2DMovieAndCashPayment(1);
        assertThat(result, is(expected));
    }

    @Test
    public void should_return_60_for_two_tickets() {
        Double result = 60D;
        Double expected = new ShouPiaoChu().getPriceFor2DMovieAndCashPayment(2);
        assertThat(result, is(expected));
    }

    @Test
    public void should_return_60_for_single_ticket_of_3d_movie() {
        Double result = new ShouPiaoChu().getPriceForCashPayment(1, "3D");
        Double expected = 60D;
        assertThat(result, is(expected));
    }

    @Test
    public void should_return_120_for_two_tickets_of_3d_movie() {
        Double result = new ShouPiaoChu().getPriceForCashPayment(2, "3D");
        Double expected = 120D;
        assertThat(result, is(expected));
    }

    @Test
    public void should_return_30_for_single_ticket_of_2d_movie() {
        Double result = new ShouPiaoChu().getPriceForCashPayment(1, "2D");
        Double expected = 30D;
        assertThat(result, is(expected));
    }

    @Test
    public void should_return_60_for_two_tickets_of_2d_movie() {
        Double result = new ShouPiaoChu().getPriceForCashPayment(2, "2D");
        Double expected = 60D;
        assertThat(result, is(expected));
    }

    @Test
    public void should_return_48_for_single_ticket_of_3d_movie_using_card() {
        Double result = new ShouPiaoChu().getPrice(1, "3D", "card");
        Double expected = 48D;
        assertThat(result, is(expected));
    }

    @Test
    public void should_return_96_for_two_tickets_of_3d_movie_using_card() {
        Double result = new ShouPiaoChu().getPrice(2, "3D", "card");
        Double expected = 96D;
        assertThat(result, is(expected));
    }

    @Test
    public void should_return_60_for_single_ticket_of_3d_movie_using_cash() {
        Double result = new ShouPiaoChu().getPrice(1, "3D", "cash");
        Double expected = 60D;
        assertThat(result, is(expected));
    }

    @Test
    public void should_return_120_for_two_tickets_of_3d_movie_using_cash() {
        Double result = new ShouPiaoChu().getPrice(2, "3D", "cash");
        Double expected = 120D;
        assertThat(result, is(expected));
    }

    @Test
    public void should_return_24_for_single_ticket_of_2d_movie_using_card() {
        Double result = new ShouPiaoChu().getPrice(1, "2D", "card");
        Double expected = 24D;
        assertThat(result, is(expected));
    }

    @Test
    public void should_return_48_for_two_tickets_of_2d_movie_using_card() {
        Double result = new ShouPiaoChu().getPrice(2, "2D", "card");
        Double expected = 48D;
        assertThat(result, is(expected));
    }

    @Test
    public void should_return_30_for_single_ticket_of_2d_movie_using_cash() {
        Double result = new ShouPiaoChu().getPrice(1, "2D", "cash");
        Double expected = 30D;
        assertThat(result, is(expected));
    }

    @Test
    public void should_return_60_for_two_tickets_of_2d_movie_using_cash() {
        Double result = new ShouPiaoChu().getPrice(2, "2D", "cash");
        Double expected = 60D;
        assertThat(result, is(expected));
    }
}
