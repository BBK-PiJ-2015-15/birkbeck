// 11 Poker hands
//
// Outputs best poker hand from card sequence.
//
// Note: this code doesn't use functions or arrays, which would simplify it by a
// lot. It also doesn't do many validation of the user input, like for example
// checking if the user entered a card with the same rank and suit twice. If
// that's the case the result will not necessarily be correct.
//

int rank, rank1 = -1, rank2 = -1, rank3 = -1, rank4 = -1, rank5 = -1;
String suit, suit1, suit2, suit3, suit4, suit5;
int i = 0;

while (i < 5) {
    // ask the user to enter the card rank
    print "Enter a card rank (1 to 10, J, Q, K): ";
    String str = System.console().readLine();

    // convert card rank to an integer and validate
    switch (str) {
    case "j":
    case "J":
        rank = 11;
        break;
    case "q":
    case "Q":
        rank = 12;
        break;
    case "k":
    case "K":
        rank = 13;
        break;
    default:
        rank = Integer.parseInt(str);
        break;
    }

    if (!(rank >= 1 && rank <= 13)) {
        println "Invalid card rank, try again."
        continue;
    }

    // ask the user to enter the card suit
    print "Enter a card suit (spades, hearts, diamonds, clubs): ";
    suit = System.console().readLine();

    // validate card suit
    switch (suit) {
    case "s":
    case "spades":
    case "h":
    case "hearts":
    case "d":
    case "diamonds":
    case "c":
    case "clubs":
        break;
    default:
        println "Invalid card suit, try again."
        continue;
    }

    // to make finding the best poker hand value easier we will sort the cards
    // by rank as they are entered

    // find the card index
    int index, cur_rank;

    for (index = 0; index < i; index++) {
        // get the current index card rank value
        switch (index) {
        case 0:
            cur_rank = rank1;
            break;
        case 1:
            cur_rank = rank2;
            break;
        case 2:
            cur_rank = rank3;
            break;
        case 3:
            cur_rank = rank4;
            break;
        case 4:
            cur_rank = rank5;
            break;
        }

        // we found the index if there's no card at the current index or if the
        // entered card rank is less than the current index card rank value
        if (cur_rank == -1 || rank < cur_rank)
            break;
    }

    // move cards up the pseudo array
    for (int j = 0; j < (4 - index); j++) {
        switch (j) {
        case 0:
            rank5 = rank4;
            suit5 = suit4;
            break;
        case 1:
            rank4 = rank3;
            suit4 = suit3;
            break;
        case 2:
            rank3 = rank2;
            suit3 = suit2;
            break;
        case 3:
            rank2 = rank1;
            suit2 = suit1;
            break;
        }
    }

    // save the rank and suit
    switch (index) {
    case 0:
        rank1 = rank;
        suit1 = suit;
        break;
    case 1:
        rank2 = rank;
        suit2 = suit;
        break;
    case 2:
        rank3 = rank;
        suit3 = suit;
        break;
    case 3:
        rank4 = rank;
        suit4 = suit;
        break;
    case 4:
        rank5 = rank;
        suit5 = suit;
        break;
    }

    i++;
}

print "Cards: ";
print rank1 + " " + suit1 + ", ";
print rank2 + " " + suit2 + ", ";
print rank3 + " " + suit3 + ", ";
print rank4 + " " + suit4 + ", ";
println rank5 + " " + suit5;

String hand = "nothing";

// check for straight flush or straight (if they have the same suit the hand
// will never be any of the other hands)
if ((rank1 + 1) == rank2 && (rank2 + 1) == rank3 && (rank3 + 1) == rank4 && \
        (rank4 + 1) == rank5) {
    if (suit1 == suit2 && suit1 == suit3 && suit1 == suit4 && suit1 == suit4) {
        hand = "straight flush";
    } else {
        hand = "straight";
    }
} else {
    // check for flush
    // all cards have the same suit

    // check for poker
    // since they are sorted they will either be AAAAB or ABBBB

    // check for full house
    // since they are sorted they will either be AAABB or AABBB

    // check for three of a kind
    // since they are sorted they will either be AAABC, ABBBC or ABCCC
    // two of these sequence can be checked in the full house check

    // check for two pairs
    // AABBC, AABCC or ABBCC

    // check for pair
    // AABCD, ABBCD, ABCCD, ABCDD
    // some checks can be made on the two pair check

    if (suit1 == suit2 && suit1 == suit3 && suit1 == suit4 && suit1 == suit5) {
        hand = "flush";
    } else if ((rank1 == rank2 && rank1 == rank3 && rank1 == rank4) || \
            (rank2 == rank3 && rank2 == rank4 && rank2 == rank5)) {
        hand = "poker";
    } else if (rank1 == rank2 && rank1 == rank3) {
        if (rank4 == rank5)
            hand = "full house";
        else
            hand = "three of a kind";
    } else if (rank3 == rank4 && rank3 == rank5) {
        if (rank1 == rank2)
            hand = "full house";
        else
            hand = "three of a kind";
    } else if (rank2 == rank3 && rank2 == rank4) {
        hand = "three of a kind";
    } else if (rank1 == rank2) {
        if (rank3 == rank4 || rank4 == rank5)
            hand = "two pairs";
        else
            hand = "pair";
    } else if (rank2 == rank3) {
        if (rank4 == rank5)
            hand = "two pairs";
        else
            hand = "pair";
    } else if (rank3 == rank4 || rank4 == rank5) {
        hand = "pair";
    }
}

println "Your best hand is: " + hand + ".";
