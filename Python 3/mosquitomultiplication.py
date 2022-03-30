# Had to adjust input method, runs fine on Kattis but not in interpreter

import sys


def run():
    for i in sys.stdin:
        line = i.split()
        m = int(line[0])
        p = int(line[1])
        l = int(line[2])
        e = int(line[3])
        r = int(line[4])
        s = int(line[5])
        n = int(line[6])
        for i in range(n):  # For all weeks
            currentP = p
            p = l // r  # Every R-th L becomes a P
            l = m * e  # Adult M lays E eggs
            m = currentP // s  # Every S-th P becomes M
        print(m)


if __name__ == '__main__':
    run()
