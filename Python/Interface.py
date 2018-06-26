import abc

class Problem:
    @abc.abstractmethod
    def Calculate(self):
        raise NotImplementedError('need to define Calculate')