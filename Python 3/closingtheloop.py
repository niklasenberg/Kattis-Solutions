def run():
    n = int(input())

    for i in range(n):
        s = int(input()) # Useless?
        ropes = input().split(' ')

        blue = []
        red = []

        total = 0
        for rope in ropes:
            length = int(rope[0:rope.__len__()-1])
            if rope[rope.__len__()-1] == 'R':
                red.append(length)
            else:
                blue.append(length)

        blue.sort(reverse=True)
        red.sort(reverse=True)

        while len(blue) > 0 and len(red) > 0:
            total += blue.pop(0) + red.pop(0) - 2

        print(f'Case #{i+1}: {total}')


if __name__ == '__main__':
    run()
