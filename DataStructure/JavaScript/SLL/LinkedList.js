'use Strict';

const Node = require('./Node');

class LinkedList {
  constructor() {
    this.head = null;
  }

  append(data) {
    debugger;
    if (!this.head) {
      this.head = new Node(data);
      return this;
    }
    let newNode = new Node(data);
    let current = this.head;
    while (current.next) {
      current = current.next;
    }
    current.next = newNode;
    return this;
  }

  display() {
    let current = this.head;
    let final = '';
    while (current) {
      final += `${current.data} --> `;
      current = current.next;
    }
    return final ? final : 'Empty';
  }

  addToHead(data) {
    const newNode = new Node(data);
    newNode.next = this.head;
    this.head = newNode;
    return this;
  }

  includes(data) {
    if (!this.head) return false;
    let current = this.head;
    while (current) {
      if (current.data == data) return true;
      current = current.next;
    }
    return false;
  }

  position(data) {
    let position = 0;
    if (!this.head) return -1;
    let current = this.head;
    while (current) {
      if (current.data == data) {
        return position;
      }
      current = current.next;
    }
    return -1;
  }

  addNPosition(position, data) {
    const newNode = new Node(data);
    if (!this.head || position == 0) {
      newNode.next = this.head;
      this.head = newNode;
      return this;
    }
    let currentPosition = 1;
    let previous = this.head;
    let currentNode = previous.next;
    while (currentNode) {
      if (position == currentPosition) {
        newNode.next = currentNode;
        previous.next = newNode;
        return this;
      }
      previous = previous.next;
      currentNode = previous.next;
      currentPosition++;
    }
    previous.next = newNode;
    return this;
  }

  deleteNode(position) {
    if (position == 0) {
      let deletedNode = this.head;
      this.head = this.head.next;
      deletedNode.next = null;
      return deletedNode;
    }
    let currentPosition = 1;
    let previous = this.head;
    let currentNode = previous.next;
    while (currentNode) {
      if (position == currentPosition) {
        previous.next = currentNode.next;
        currentNode.next = null;
        return currentNode;
      }
      previous = previous.next;
      currentNode = previous.next;
      currentPosition++;
    }
  }

  addAfter(position, data) {
    const newNode = new Node(data);
    let previousNode = this.head;
    let currentNode = previousNode.next;
    let currentPosition = 0;
    while (currentNode) {
      if (position == currentPosition) {
        newNode.next = currentNode;
        previousNode.next = newNode;
        return this;
      }
      previousNode = previousNode.next;
      currentNode = previousNode.next;
      currentPosition++;
    }
    previousNode.next = newNode;
    return this;
  }
}

module.exports = LinkedList;
