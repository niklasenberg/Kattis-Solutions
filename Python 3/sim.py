#TODO: Fails last test, needs to be more efficient

def run():
    n = int(input())

    for i in range(n):
        result = []
        line = input()
        index = 0
        size = 0

        for char in line:
            if char == '[':
                index = 0
            elif char == ']':
                index = size - 1
            elif char == '<' and index != 0:
                result[index-1] = ''
                index -= 1
            elif char != '<':
                if index == size - 1:
                    size += 1
                result.insert(index, char)
                index += 1

        print(''.join(result))


if __name__ == '__main__':
    run()
