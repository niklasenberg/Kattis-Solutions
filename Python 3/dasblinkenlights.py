def run():
    line = input().split()
    p = int(line[0])
    q = int(line[1])
    s = int(line[2])

    blinked = False
    pblink = p
    qblink = q
    for i in range(s):
        if i == pblink:
            pblink += p
        if i == qblink:
            qblink += q
        if pblink == qblink and pblink <= s:
            blinked = True

    if blinked:
        print('yes')
    else:
        print('no')


if __name__ == '__main__':
    run()
