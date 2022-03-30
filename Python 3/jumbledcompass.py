def run():
    pos = int(input())
    dest = int(input())

    if dest < pos:
        clockwise = 360 - pos + dest
    else:
        clockwise = dest - pos

    if dest > pos:
        counterclock = 360 - dest + pos
    else:
        counterclock = pos - dest

    if clockwise <= counterclock:
        print(clockwise)
    else:
        print(-abs(counterclock))


if __name__ == '__main__':
    run()
