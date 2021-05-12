'use strict';

const Node = require('./Node');

class BinaryTree {
  constructor(root = null) {
    this.root = root;
  }

  preOrder() {
    let array = [];

    const _walk = (node) => {
      if (node) {
        array.push(node.value);
        _walk(node.left);
        _walk(node.right);
      }
    };

    _walk(this.root);
    return array;
  }

  inOrder() {
    let array = [];

    const _walk = (node) => {
      if (node) {
        _walk(node.left);
        array.push(node.value);
        _walk(node.right);
      }
    };

    _walk(this.root);
    return array;
  }

  postOrder() {
    let array = [];
    const _walk = (node) => {
      if (node) {
        _walk(node.left);
        _walk(node.right);
        array.push(node.value);
      }
    };

    _walk(this.root);

    return array;
  }
}

module.exports = BinaryTree;
