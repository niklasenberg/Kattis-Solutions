def run():
    line = input().split()
    bage = int(line[0])
    bretirement = int(line[1])
    bsaves = int(line[2])
    aage = int(line[3])
    asaves = int(line[4])

    bfund = (bretirement - bage) * bsaves
    afund = 0
    count = 0
    while afund <= bfund:
        afund += asaves
        count += 1

    print(aage + count)


if __name__ == '__main__':
    run()
