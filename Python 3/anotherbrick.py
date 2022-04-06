def run():
    dimensions = [int(x) for x in input().split()]
    bricks = [int(x) for x in input().split()]

    finished = False
    currentwidth = 0
    currentheight = 0
    for brick in bricks:
        currentwidth += brick
        if currentwidth == dimensions[1]:
            currentheight += 1
            currentwidth = 0

        if currentheight == dimensions[0]:
            finished = True
            break

    if finished:
        print("YES")
    else:
        print("NO")


if __name__ == '__main__':
    run()
