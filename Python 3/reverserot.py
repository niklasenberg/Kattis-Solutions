def run():
    line = input().split()
    n = int(line[0])

    chars = list('ABCDEFGHIJKLMNOPQRSTUVWXYZ_.')

    while n != 0:
        result = ''
        backwards = list(line[1])
        backwards.reverse()

        for char in backwards:
            index = chars.index(char) + n

            if index >= len(chars):
                index = index - len(chars)

            result += chars[index]

        print(result)

        line = input().split()
        n = int(line[0])


if __name__ == '__main__':
    run()
